public class Total_amount_of_points {

    public static int points(String[] games) {

        int points = 0;
        for (int i = 0; i < games.length; i++){
                if (Integer.parseInt(games[i].split(":")[0]) > Integer.parseInt(games[i].split(":")[1])){
                    points +=3;
                } else {
                    if (Integer.parseInt(games[i].split(":")[0]) == Integer.parseInt(games[i].split(":")[1])){
                        points +=1;
                }
            }
        }
        return points;
    }

    public static void main(String[] args) {
        String[] games = {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"};
        System.out.println(points(games));
    }
}
