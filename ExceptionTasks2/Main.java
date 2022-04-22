package ExceptionTasks2;

public class Main {
    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало", 2010, 16),
                new Movie("LordOfTheRings", 2001, 21),
                new Movie("SpiderMan", 2021, 1)

        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre("Дон-Кихот", 1962, 60)
        };
    }

    public static void validEvent(Event event) {
        if (event.getTitle() == null || event.getReleaseYear() == 0 || event.getAge() == 0) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        for (Movie movie : getMovies()) {
            validEvent(movie);
        }
        for (Theatre theatre : getTheatres()) {
            validEvent(theatre);
        }
        System.out.println("Все события корректны");
    }
}
