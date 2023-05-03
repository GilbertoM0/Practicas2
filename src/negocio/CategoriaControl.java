package negocio;

import datos.CategoriaDAO;
import entidades.Categorias;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class CategoriaControl
{

    private final CategoriaDAO DATOS;//Tiene comunicacion con capa de datos     Vista,control o negocio, datos
    private Categorias obj;
    private DefaultTableModel modeloTabla;

    public CategoriaControl ()
    {
        DATOS = new CategoriaDAO ();
        obj = new Categorias ();
    }

    //Metodo listar, llenara la tabla, generara el modelo y pasarselo
    public DefaultTableModel listar (String texto)
    {
        List<Categorias> lista = new ArrayList ();
        lista.addAll (DATOS.listar (texto)); //Datos se conecta a la capa interior
        //Rotulos de la tabla JTable
        String[] titulos =
        {
            "ID", "Categoria", "Descripcion", "Observaciones", "Estado"
        };
        String estado;
        String[] registro = new String[5];
        // Agregar los titulos al modelo
        modeloTabla = new DefaultTableModel (null, titulos);
        //Recorrer la lista categoria
        for (Categorias item : lista)
        {
            //Verificar si esta activo o inactivo
            if (item.isActivo ())
            {
                estado = "Activo";
            } else
            {
                estado = "Inactivo";
            }

            //Llenar registro
            registro[0] = Integer.toString (item.getIdCategoria ());
            registro[1] = item.getNombreCategoria ();
            registro[2] = item.getDescripcionCategoria ();
            registro[3] = item.getObservaciones ();
            //registro[4] = item.getImagenCategoria ();
            registro[4] = estado;

            //Agregar el registro al Modelo
            modeloTabla.addRow (registro);
        }
        return modeloTabla;

    }

    public String insertar (String nombre, String img, String descripcion, String obs)
    {
        //Verificar que no exista la categoria a intertar
        if (DATOS.existe (nombre))
        {
            return "Categoria:" + nombre + "ya existe";
        } else
        {
            //Llenamos el objeto
            obj.setNombreCategoria (nombre);
            obj.setImagenCategoria (img);
            obj.setDescripcionCategoria (descripcion);
            obj.setObservaciones (obs);
            obj.setActivo (true);

            //Listo para insertar en la base de datos
            if (DATOS.insertar (obj))
            {
                return "OK";
            } else
            {
                return "Error en la insercion del registro";
            }

        }
    }

    //Metodo Actualizar
    public String actualizar (int id, String nombre, String nombreAnt, String descripcion,String img, String Observaciones)
    {
        //1. Verificar si el usuario desea modificar el nombre de la categoria

        if (nombre.equals (nombreAnt))
        {
            //2.Llenar el objeto
            obj.setIdCategoria (id);
            obj.setNombreCategoria (nombre);
            obj.setDescripcionCategoria (descripcion);
            obj.setImagenCategoria (img);
            obj.setObservaciones (Observaciones);

            //3.Actualizar el registro
            if (DATOS.actualizar (obj))
            {
                return "OK";
            } else
            {
                return "Error en la actualizacion";
            }
        } else
        {
            //El usuario desea cambiar el nombre de la categoria y la tenemos que buscar
            if (DATOS.existe (nombre))
            {
                return "Ya existe la categoria.";
            } else
            {
                //2.Llenar el objeto
                obj.setIdCategoria (id);
                obj.setNombreCategoria (nombre);
                obj.setDescripcionCategoria (descripcion);
                obj.setImagenCategoria (img);
                obj.setObservaciones (Observaciones);

                //3.Actualizar el registro
                if (DATOS.actualizar (obj))
                {
                    return "OK";
                } else
                {
                    return "Error en la actualizacion";
                }
            }
        }
    }

    public String desactivar (int d)
    {
        if (DATOS.desactivar (d))
        {
            return "OK";
        } else
        {
            return "No se puede desactivar el registro";
        }
    }

    public String activar (int d)
    {
        if (DATOS.activar (d))
        {
            return "OK";
        } else
        {
            return "No se puede activar el registro";
        }
    }
    
    public String imagen(String img)
    {
        if(DATOS.existe (img))
        {
            return DATOS.imagen (img);
        }
        else 
            return "Null";
    }
    

}
