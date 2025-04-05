import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class User {
    int userId;
    String name;
    int age;
    List<Integer> friendIds; 
    User next;
    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}
class SocialMedia {
    private User head = null;
    public void addUser(int userId, String name, int age) {
        User newUser = new User(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
    }
    public void addFriendConnection(int userId1, int userId2) {
        User user1 = findUser(userId1);
        User user2 = findUser(userId2);
        if (user1 != null && user2 != null) {
            if (!user1.friendIds.contains(userId2)) {
                user1.friendIds.add(userId2);
            }
            if (!user2.friendIds.contains(userId1)) {
                user2.friendIds.add(userId1);
            }
        }
    }
    public void removeFriendConnection(int userId1, int userId2) {
        User user1 = findUser(userId1);
        User user2 = findUser(userId2);
        if (user1 != null && user2 != null) {
            user1.friendIds.remove(Integer.valueOf(userId2));
            user2.friendIds.remove(Integer.valueOf(userId1));
        }
    }
    public List<Integer> findMutualFriends(int userId1, int userId2) {
        User user1 = findUser(userId1);
        User user2 = findUser(userId2);
        List<Integer> mutualFriends = new ArrayList<>();
        if (user1 != null && user2 != null) {
            for (int friendId1 : user1.friendIds) {
                if (user2.friendIds.contains(friendId1)) {
                    mutualFriends.add(friendId1);
                }
            }
        }
        return mutualFriends;
    }
    public void displayFriends(int userId) {
        User user = findUser(userId);
        if (user != null) {
            System.out.println("Friends of " + user.name + " (ID: " + user.userId + "):");
            if (user.friendIds.isEmpty()) {
                System.out.println("No friends.");
            } else {
                for (int friendId : user.friendIds) {
                    User friend = findUser(friendId);
                    if (friend != null) {
                        System.out.println(friend.name + " (ID: " + friend.userId + ")");
                    }
                }
            }
        }
    }
    public User searchUser(String name) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public User searchUser(int userId) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == userId) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public void countFriends() {
        User temp = head;
        while (temp != null) {
            System.out.println(temp.name + " (ID: " + temp.userId + ") has " + temp.friendIds.size() + " friends.");
            temp = temp.next;
        }
    }
    private User findUser(int userId) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == userId) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public void displayUsers() {
        User temp = head;
        while (temp != null) {
            System.out.println("User ID: " + temp.userId + ", Name: " + temp.name + ", Age: " + temp.age);
            temp = temp.next;
        }
    }
}
public class g {
    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();
        Scanner sc = new Scanner(System.in);
        sm.addUser(1, "Alice", 25);
        sm.addUser(2, "Bob", 30);
        sm.addUser(3, "Charlie", 22);
        while (true) {
            System.out.println("\n1. Add Friend Connection");
            System.out.println("2. Remove Friend Connection");
            System.out.println("3. Find Mutual Friends");
            System.out.println("4. Display Friends");
            System.out.println("5. Search User by Name");
            System.out.println("6. Count Friends");
            System.out.println("7. Display All Users");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter User IDs for friend connection: ");
                    int userId1 = sc.nextInt();
                    int userId2 = sc.nextInt();
                    sm.addFriendConnection(userId1, userId2);
                    break;
                case 2:
                    System.out.print("Enter User IDs to remove friend connection: ");
                    userId1 = sc.nextInt();
                    userId2 = sc.nextInt();
                    sm.removeFriendConnection(userId1, userId2);
                    break;
                case 3:
                    System.out.print("Enter User IDs to find mutual friends: ");
                    userId1 = sc.nextInt();
                    userId2 = sc.nextInt();
                    List<Integer> mutualFriends = sm.findMutualFriends(userId1, userId2);
                    if (mutualFriends.isEmpty()) {
                        System.out.println("No mutual friends.");
                    } else {
                        System.out.println("Mutual Friends: " + mutualFriends);
                    }
                    break;
                case 4:
                    System.out.print("Enter User ID to display friends: ");
                    int userId = sc.nextInt();
                    sm.displayFriends(userId);
                    break;
                case 5:
                    System.out.print("Enter User Name to search: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    User user = sm.searchUser(name);
                    if (user != null) {
                        System.out.println("User found: " + user.name + " (ID: " + user.userId + ")");
                    } else {
                        System.out.println("User not found.");
                    }
                    break;
                case 6:
                    sm.countFriends();
                    break;
                case 7:
                    sm.displayUsers();
                    break;
                case 8:
                    sc.close();
                    return;
            }
        }
    }
}