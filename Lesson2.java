//Задание: создать массив данных, содержащий данные о клиентах (ФИО/возраст/пол) - 10 шт.
// Информацию о клиентах указать в коде.
// Распечатать на экран данные всех клиентов мужского пола, отсортированных по возрасту
public class Lesson2 {
    public static void main(String[] args) {
        class Employee{
            public int    employeeId;
            public String name;
            public int age;
            public String gender;
            public Employee(int employeeId, String name, int age, String gender){
                this.employeeId = employeeId;
                this.name = name;
                this.age = age;
                this.gender = gender;
            }
        }
//
        Employee[] employeeArray = new Employee[10];
        employeeArray[0] = new Employee(1, "Иванова Татьяна Васильевна",18, "жен");
        employeeArray[1] = new Employee(2,"Петров Игорь Дмитриевич", 64,"муж");
        employeeArray[2] = new Employee(3,"Киселев Геннадий Александрович", 28, "муж"  );
        employeeArray[3] = new Employee(4,"Алексеев Кирилл Афанасьевич", 81, "муж"  );
        employeeArray[4] = new Employee(5,"Васильева Екатерина Анатольевна", 45, "жен"  );
        employeeArray[5] = new Employee(6,"Федорова Тамара Алексеевна", 33, "жен"  );
        employeeArray[6] = new Employee(7,"Озерова Людмила Аркадьевна", 57, "жен"  );
        employeeArray[7] = new Employee(8,"Константинов Роман Игоревич", 66, "муж"  );
        employeeArray[8] = new Employee(9,"Фролова Татьяна Михайловна", 25, "жен"  );
        employeeArray[9] = new Employee(10,"Васнецов Архип Юрьевич", 29, "муж"  );
//
//        java.util.Arrays.sort(employeeArray, new Comparator() {
//            @Override
//            public int compare(Employee e1, Employee e2) {
//                return e1.employeeId - e2.employeeId;
//            }
//        });
        for(int i=0; i < employeeArray.length; i++) {
            System.out.println("ID = " + employeeArray[i].name+employeeArray[i].gender);
        }
    }
}
