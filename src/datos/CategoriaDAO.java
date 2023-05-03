package datos;

import database.Conexion;
import datos.interfaces.CrudSimpleInterface;
import entidades.Categorias;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class CategoriaDAO implements CrudSimpleInterface<Categorias>
{

    private final Conexion CON; //Conectarnos a la BD
    private PreparedStatement ps; //Precompila la consulta
    private ResultSet rs; //Guarda la informacion que le da en MySQL
    private boolean resp; //Variable que controla si se interto o no

    public CategoriaDAO ()
    {
        CON = Conexion.getInstancia ();// Conexion a la base de datos
    }

    @Override
    public List<Categorias> listar (String texto)
    {
        List<Categorias> registros = new ArrayList ();
        String sql;
        try
        {
            sql = "SELECT * FROM categorias;";
            ps = CON.conectar ().prepareStatement (sql);
            //Cuando regresesa un resultado la consulta
            //utilizamos executeQuery()
            rs = ps.executeQuery ();//Regresa todo lo que tenga
            while (rs.next ())
            {
                registros.add (new Categorias (rs.getInt (1),
                        rs.getString (2), rs.getString (3), rs.getString (4), rs.getString (5),
                        rs.getBoolean (6)));

            }
            ps.close ();
            rs.close ();
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog (null, e.getMessage ());
        } finally
        {
            ps = null;
            rs = null;
            CON.desconectar ();
        }
        return registros;
    }

    @Override
    public boolean insertar (Categorias obj)
    {
        String sql;
        resp = false;
        try
        {
            sql = "INSERT INTO categorias(nombreCategoria, imagenCategoria, descripcionCategoria, observaciones, activo)\n"
                    + "values (?,?,?,?,1)";
            ps = CON.conectar ().prepareStatement (sql);//le da sql a prepare para que la prepare y se conecta
            //Pasar los valores a la consulta
            ps.setString (1, obj.getNombreCategoria ());
            ps.setString (2, obj.getImagenCategoria ());
            ps.setString (3, obj.getDescripcionCategoria ());
            ps.setString (4, obj.getObservaciones ());
            //Verificar si se inserto el registro
            if (ps.executeUpdate () > 0) //si se ingreso algo entra y resp sera true
            {
                resp = true;
            }

            ps.close ();
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog (null, e.getMessage ());
        } finally
        {
            ps = null;
            CON.desconectar ();
        }
        return resp;
    }

    @Override
    public boolean actualizar (Categorias obj)
    {
        String sql;
        resp = false;
        try
        {
            sql = "UPDATE Categorias\n"
                    + "SET nombreCategoria =?, imagenCategoria =?, descripcionCategoria=?, observaciones=?\n"
                    + "WHERE idCategoria =?;";
            ps = CON.conectar ().prepareStatement (sql);//le da sql a prepare para que la prepare y se conecta
            //Pasar los valores a la consulta
            ps.setString (1, obj.getNombreCategoria ());
            ps.setString (2, obj.getImagenCategoria ());
            ps.setString (3, obj.getDescripcionCategoria ());
            ps.setString (4, obj.getObservaciones ());
            ps.setInt (5, obj.getIdCategoria ());
            //Verificar si se inserto el registro
            if (ps.executeUpdate () > 0) //si se ingreso algo entra y resp sera true porque ejecuto correctamente
            {
                resp = true;
            }

            ps.close ();
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog (null, e.getMessage ());
        } finally
        {
            ps = null;
            CON.desconectar ();
        }
        return resp;
    }

    @Override
    public boolean desactivar (int id)
    {
        String sql;
        resp = false;
        try
        {
            //sql = "UPDATE Categorias SET activo =0 where idCategoria=?;";
            sql = "DELETE from categorias where idCategorias=?;";
            ps = CON.conectar ().prepareStatement (sql);//le da sql a prepare para que la prepare y se conecta
            //Pasar los valores a la consulta
            ps.setInt (1, id);
            //Verificar si se inserto el registro
            if (ps.executeUpdate () > 0) //si se ingreso algo entra y resp sera true porque ejecuto correctamente
            {
                resp = true;
            }

            ps.close ();
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog (null, e.getMessage ());
        } finally
        {
            ps = null;
            CON.desconectar ();
        }
        return resp;
    }

    @Override
    public boolean activar (int id)
    {
        String sql;
        resp = false;
        try
        {
            sql = "UPDATE Categorias SET activo =1 WHERE idCategoria=?;";
            ps = CON.conectar ().prepareStatement (sql);//le da sql a prepare para que la prepare y se conecta
            //Pasar los valores a la consulta
            ps.setInt (1, id);
            //Verificar si se inserto el registro
            if (ps.executeUpdate () > 0) //si se ingreso algo entra y resp sera true porque ejecuto correctamente
            {
                resp = true;
            }

            ps.close ();
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog (null, e.getMessage ());
        } finally
        {
            ps = null;
            CON.desconectar ();
        }
        return resp;
    }

    @Override
    public int total ()
    {
        String sql;
        int totalRegistros = 0;
        try
        {
            sql = "Select count(idCategoria) AS numRegistros FROM categorias;";
            ps = CON.conectar ().prepareStatement (sql);//le da sql a prepare para que la prepare y se conecta
            rs = ps.executeQuery (); //Regresa todo lo que tenga
            //Obtengo el numero de registros de la consulta
            while (rs.next ()) //next() avanza al siguiente registro
            {
                totalRegistros = rs.getInt ("numRegistros)"); //count(idCategoria)
            }
            ps.close ();
        } catch (SQLException e)//cachamos algun error
        {
            JOptionPane.showMessageDialog (null, e.getMessage ());
        } finally
        {
            ps = null;
            rs = null;
            CON.desconectar ();
        }
        return totalRegistros;
    }

    @Override
    public boolean existe (String texto)
    {
        String sql;
        resp = false;
        try
        {
            sql = "select idCategoria from categorias where nombreCategoria =?;";
            ps = CON.conectar ().prepareStatement (sql);//le da sql a prepare para que la prepare y se conecta
            ps.setString (1, texto);
            rs = ps.executeQuery (); //Regresa todo lo que tenga

            //Mueve al ultimo registro
            //rs.last ();
            if (rs.next ())// Obtengo el renglon registro
            {
                resp = true;
            }

            ps.close ();
            rs.close ();
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog (null, e.getMessage ());
        } finally
        {
            ps = null;
            rs = null;
            CON.desconectar ();
        }
        return resp;
    }

    @Override
    public String imagen (String img)
    {
        String sql;
        String ruta = "";
        try
        {
            sql = "select imagenCategoria from categorias where nombreCategoria =?;";
            ps = CON.conectar ().prepareStatement (sql);//le da sql a prepare para que la prepare y se conecta
            ps.setString (1, img);
            rs = ps.executeQuery (); //Regresa todo lo que tenga

            //Mueve al ultimo registro
            //rs.last ();
            if (rs.next ())// Obtengo el renglon registro
            {
                ruta = rs.getString (1);
            }

            ps.close ();
            rs.close ();
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog (null, e.getMessage ());
        } finally
        {
            ps = null;
            rs = null;
            CON.desconectar ();
        }
        return ruta;
    }

}
