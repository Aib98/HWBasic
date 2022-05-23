import java.util.*;

// Надо добавить методы equals() И hashCode()
    public class HomeWorkHashM {
    public static void main(String[] args) {
//            Map<Person, List<Account>> personAccount = getPersonAccount();
//
//            Person petrov = new Person("Петров", 1999);
//            Account petrovAddress = (Account) personAccount.get(petrov);
//            System.out.println(petrovAddress.bill);
//
//        }

//        private static Map<Person, List<Account>> getPersonAccount() {


//            Map<Person, List<Account>> personAccount = new HashMap<>();
//            Person person1 = new Person("Иванов", 1985);
//            Person person2 = new Person("Петров", 1999);
//            Person person3 = new Person("Сидоров", 1980);
//
//            Map<Person, List<Account>> personAddresses = new HashMap<>();
//            personAddresses.put(person1, Arrays.asList(new Account(12345), new Account(54321)));
//            personAddresses.put(person2, Arrays.asList(new Account(56215), new Account(77777)));
//            personAddresses.put(person3, Arrays.asList(new Account(54556), null));





//            System.out.println(personAddresses);
//            System.out.println();

//                for (Person person : personAddresses.keySet()) {//Выводит всех клиентов и все счета по ним
//                    System.out.print(person);
//                    for (Account account : personAddresses.get(person)){
//                        System.out.print(account);
//                        System.out.println();
//                    }
//                }
        Map<Person, List<Account>> personAddresses = new HashMap<>();
        personAddresses.put(new Person("Иванов", 1985), Arrays.asList(new Account(12345), new Account(54321), new Account(88888)));
        personAddresses.put(new Person("Петров", 1999), Arrays.asList(new Account(56215), new Account(77777)));
        personAddresses.put(new Person("Сидоров", 1980), Arrays.asList(new Account(54556), null));

        for (Person person : personAddresses.keySet()) {
            List<Account> petrov = personAddresses.get(56215);
            System.out.println(petrov);

            String bill = String.valueOf(personAddresses.get("Иванов"));
            System.out.println(bill);
        }

//        Set set = personAddresses.entrySet();//Вывод всех клиентов и счетов к нему
//        Iterator i = set.iterator();
//        while (i.hasNext()){
//            Map.Entry me = (Map.Entry)i.next();
//            System.out.print(me.getKey() + " : ");
//            System.out.println(me.getValue());
//            }

        for(Person keys: personAddresses.keySet()){
//            System.out.println(keys);
        }
        for(Map.Entry<Person, List<Account>> item : personAddresses.entrySet()){
            System.out.printf("%s  %s \n", item.getKey(), item.getValue());
        }











//            Person petrov = new Person("Петров", 1999);
//            Account petrovAddress = (Account) personAccount.get(petrov);
//            System.out.println(petrovAddress.bill);
//
//            Account account = new Account(12345);
//            Person billPerson = (Person) personAccount.get(personAccount);
//            System.out.println(personAccount);






    }

//            return personAddresses;
}


//    }



