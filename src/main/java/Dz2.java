//Дана строка sql-запроса "select * from students where ".
//Сформируйте часть WHERE этого запроса, используя StringBuilder.
//Данные для фильтрации приведены ниже в виде json-строки.
//Если значение null, то параметр не должен попадать в запрос.
//Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
public class Dz2 {
    public static void main(String[] args) {
        String s1 = "select * from students where ";
        String s2 = ("{\"name\":\"Ivanov\"," +
                " \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}").replaceAll(",", "W").replaceAll("\\p{P}", " ").replaceAll("^ +| +$|( )+", "$1");

        StringBuilder sb = new StringBuilder(s2);

        while (sb.indexOf("null")!=-1){
            if(sb.lastIndexOf("W", sb.indexOf("null")) == -1){
                sb.delete(0, sb.indexOf("null")+5);
            }
            else {
                sb.delete(sb.lastIndexOf("W", sb.indexOf("null")), sb.indexOf("null")+4);
            }

        String s3 = sb.toString().replaceAll("W", "").replaceAll("^ +| +$|( )+", "$1");

        String[] strings  = s3.split(" ");

        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.append(s1).append(strings[0]).append("=").append(strings[1]).append(" ").append(strings[2]).append("=").append(strings[3]).append(" ").append(strings[4]).append("=").append(strings[5]).append(" "));
        }


    }
}
