package edu.upc.eetac.dsa.util;


import java.io.Console;
import java.lang.reflect.Field;

public class ObjectHelper {
    public static String[] getFields(Object entity) {

        Class theClass = entity.getClass();

        Field[] fields = theClass.getDeclaredFields();

        String[] sFields = new String[fields.length];
        int i=0;

        for (Field f: fields) sFields[i++]=f.getName();

        return sFields;

    }


    public static void setter(Object object, String property, Object value) {
        // Method // invoke
        System.out.println("----------------Començant setter---------");
        Class clase = null;
        Field field = null;

        try{
            clase = object.getClass();
            System.out.println("Clase: "+ clase.toString());
            field = clase.getField(property);
            System.out.println("Field: "+ field.toString());
            field.set(object,value);
            System.out.println("Afegit "+ value.toString() + " a la clase "+ clase.toString());
        }
        catch (Exception e){
            System.out.println ("-!-!-!-!-!OJO PROBLEMA!-!-!-!-!-!");
            e.printStackTrace();
        }

    }

    public static Object getter(Object object, String property)  {
        // Method // invoke
        System.out.println("-------------Començant Getter----------------");
        Class clase = null;
        Field field = null;
        Object value = null;
        try {
            clase = object.getClass();
            System.out.println("Clase: "+ clase.toString());
            field = clase.getField(property);
            System.out.println("Field: "+ field.toString());
            value = field.get(object);
            System.out.println("Valor: "+ value.toString());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }
}
