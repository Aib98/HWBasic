import java.util.HashMap;
import java.util.Map;
public class HWHashMap {
    public static void main (String[] args){
        Map<Account, Client> accountClient = getAccountClient();

        Client petrov = new Client("Петров", 1985);
        Account petrovAccount = accountClient.get(petrov);
        System.out.println(petrovAccount.bill);


//        Map<Integer, String> client = new HashMap<Integer, String>();
//        client.put(42561, "Иванов Василий");
//        client.put(42562, "Василий Иванов");
//        client.put(49654, "Смирнов Николай");
//        client.put(78953, "Сидоров Роман");
//        System.out.println(client.get(42561));
//        client.replace(49654,"Смирнов Николай Васильевич");
//        System.out.println(client.get(49654));
//        System.out.println(client.values());
//        System.out.println(client.keySet());
//        for (Map.Entry<Integer,String> temp:client.entrySet()) {
//            System.out.println("Код: " + temp.getKey()+ " Имя: " + temp.getValue());
//        }

    }

    private static Map<Account,Client> getAccountClient() {
        Client client1 = new Client("Сидоров", 1999);
        Client client2 = new Client("Петров", 1985);
        Client client3 = new Client("Михайлов", 1990);

        Map<Account, Client> accountClient = new HashMap<>();
        accountClient.put(new Account(12345), client1);
        accountClient.put(new Account(87654), client1);
        accountClient.put(new Account(54324), client1);
        accountClient.put(new Account(32324), client2);
        accountClient.put(new Account(32162), client3);
        return accountClient;
    }



}
