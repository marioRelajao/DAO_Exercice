package edu.upc.eetac.dsa.util;


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


    public static void setter(Object object, String property, Object value) throws NoSuchFieldException, IllegalAccessException {
        // Method // invoke
        System.out.println("----------------Començant setter---------");
        Class clase = object.getClass();
        System.out.println("Clase: "+ clase.toString());
        Field field = clase.getField(property);
        System.out.println("Field: "+ field.toString());
        field.set(object,value);
        System.out.println("Afegit "+ value.toString() + " a la clase "+ clase.toString());
    }

    public static Object getter(Object object, String property) throws NoSuchFieldException, IllegalAccessException {
        // Method // invoke
        System.out.println("-------------Començant Getter----------------");
        Class clase = object.getClass();
        System.out.println("Clase: "+ clase.toString());
        Field field = clase.getField(property);
        System.out.println("Field: "+ field.toString());
        Object value = field.get(object);
        System.out.println("Valor: "+ value.toString());
        return value;
    }
}
