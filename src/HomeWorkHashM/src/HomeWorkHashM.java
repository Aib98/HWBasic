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
//
//
//
//        }

//        private static Map<Person, List<Account>> getPersonAccount() {








            Map<Person, List<Account>> personAccount = new HashMap<>();
            Person person1 = new Person("Иванов", 1985);
            Person person2 = new Person("Петров", 1999);
            Person person3 = new Person("Сидоров", 1980);

            Map<Person, List<Account>> personAddresses = new HashMap<>();
            personAddresses.put(person1, Arrays.asList(new Account(12345), new Account(54321)));
            personAddresses.put(person2, Arrays.asList(new Account(56215), new Account(77777)));
            personAddresses.put(person3, Arrays.asList(new Account(54556), null));
            System.out.println(personAddresses);



                for (Person person : personAddresses.keySet()) {
                    System.out.print(person + "имеет");
                    for (Account account : personAddresses.get(person)){
                        System.out.println(" счет " + account);
                    }
                }


                }

//            return personAddresses;
        }


//    }



