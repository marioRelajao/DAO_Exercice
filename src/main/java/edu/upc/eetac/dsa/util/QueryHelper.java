package edu.upc.eetac.dsa.util;

public class QueryHelper {

    public static String createQueryINSERT(Object entity) { //INSERT INTO employees (ID, name, surname, salary) VALUES (0, Jose, Martinez, 10);

        StringBuffer sb = new StringBuffer("INSERT INTO ");
        sb.append(entity.getClass().getSimpleName()).append(" ");
        sb.append("(");

        String [] fields = ObjectHelper.getFields(entity); //[name, surname, salary]

        sb.append("ID");
        for (String field: fields) {
            sb.append(", ").append(field);
        }

        sb.append(") VALUES (0");

        for (String field: fields) {
            System.out.println("Añadimos valor! " + sb);
            if(field.toString()=="salary"){
                String temp = ObjectHelper.getter(entity,field.toString()).toString();
                temp = temp.split("\\.")[0];
                sb.append(", ").append(temp);
            }
            else {
                sb.append(", '").append(ObjectHelper.getter(entity,field.toString())).append("'");

            }
        }

        sb.append(")");

        return sb.toString();
    }

    public static String createQuerySELECT(Object entity) {
        StringBuffer sb = new StringBuffer();
        sb.append("SELECT * FROM ").append(entity.getClass().getSimpleName());
        sb.append(" WHERE ID = 0");
        System.out.println(sb);
        String [] fields = ObjectHelper.getFields(entity);
        for (String field: fields) {
            sb.append(" AND ").append(field);
            sb.append(" = ");
            if(field.toString()=="salary"){
                String temp = ObjectHelper.getter(entity,field.toString()).toString();
                temp = temp.split("\\.")[0];
                sb.append(temp);
            }
            else {
                sb.append("'").append(ObjectHelper.getter(entity,field.toString())).append("'");
            }
            System.out.println(sb);
        }
        return sb.toString();
    }

}
