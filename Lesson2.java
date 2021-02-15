import java.util.Arrays;
import java.util.Comparator;

// Задание: создать массив данных, содержащий данные о клиентах (ФИО/возраст/пол) - 10 шт.
// Информацию о клиентах указать в коде.
// Распечатать на экран данные всех клиентов пол = "муж", отсортированных по возрастанию возраста
public class Lesson2 {
    public static void main(String[] args) {

        class Clients{
            public int clientId;
            public String name;
            public int age;
            public String gender;
            public Clients(int clientId, String name, int age, String gender){
                this.clientId = clientId;
                this.name = name;
                this.age = age;
                this.gender = gender;
            }
        }

        Clients[] clientsArray = new Clients[10];
        clientsArray[0] = new Clients(1, "Иванова Татьяна Васильевна",18, "жен");
        clientsArray[1] = new Clients(2,"Петров Игорь Дмитриевич", 64,"муж");
        clientsArray[2] = new Clients(3,"Киселев Геннадий Александрович", 28, "муж"  );
        clientsArray[3] = new Clients(4,"Алексеев Кирилл Афанасьевич", 81, "муж"  );
        clientsArray[4] = new Clients(5,"Васильева Екатерина Анатольевна", 45, "жен"  );
        clientsArray[5] = new Clients(6,"Федорова Тамара Алексеевна", 33, "жен"  );
        clientsArray[6] = new Clients(7,"Озерова Людмила Аркадьевна", 57, "жен"  );
        clientsArray[7] = new Clients(8,"Константинов Роман Игоревич", 66, "муж"  );
        clientsArray[8] = new Clients(9,"Фролова Татьяна Михайловна", 25, "жен"  );
        clientsArray[9] = new Clients(10,"Васнецов Архип Юрьевич", 29, "муж"  );

        Arrays.sort(clientsArray, new Comparator<Clients>() {
            @Override
            public int compare(Clients c1,Clients c2) {
                return c1.age-c2.age;
            }
        });

        for(int i=0; i < clientsArray.length; i++) {
            if(clientsArray[i].gender == "муж")
            System.out.println("ID-" + clientsArray[i].clientId + " ФИО:" + clientsArray[i].name + " Возраст-" + clientsArray[i].age + " Пол-" + clientsArray[i].gender);
        }
    }
}
