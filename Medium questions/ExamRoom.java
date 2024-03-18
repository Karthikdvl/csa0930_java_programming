import java.util.TreeSet;

public class ExamRoom {
    private TreeSet<Integer> seats;
    private int n;

    public ExamRoom(int n) {
        this.n = n;
        seats = new TreeSet<>();
    }

    public int seat() {
        if (seats.isEmpty()) {
            seats.add(0);
            return 0;
        }

        int maxDistance = seats.first();
        int prev = -1;
        int result = 0;

        for (int seat : seats) {
            if (prev != -1) {
                int distance = (seat - prev) / 2;
                if (distance > maxDistance) {
                    maxDistance = distance;
                    result = prev + distance;
                }
            }
            prev = seat;
        }

        if (n - 1 - seats.last() > maxDistance) {
            result = n - 1;
        }

        seats.add(result);
        return result;
    }

    public void leave(int p) {
        seats.remove(p);
    }

    public static void main(String[] args) {
        ExamRoom examRoom = new ExamRoom(10);
        System.out.println(examRoom.seat()); // Output: 0
        System.out.println(examRoom.seat()); // Output: 9
        System.out.println(examRoom.seat()); // Output: 4
        System.out.println(examRoom.seat()); // Output: 2
        examRoom.leave(4);
        System.out.println(examRoom.seat()); // Output: 5
    }
}
