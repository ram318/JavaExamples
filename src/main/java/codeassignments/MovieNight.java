package codeassignments;

import java.util.*;
import java.text.SimpleDateFormat;
import java.util.stream.Collectors;

public class MovieNight {
    public static Boolean canViewAll(Collection<Movie> movies) {

        Comparator<Movie> comparator = new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                if(o1.getStart().getTime()>o2.getStart().getTime())
                    return 1;
                else if(o1.getStart().getTime()<o2.getStart().getTime())
                    return -1;
                else
                    return 0;
            }
        };

        Collection<Movie> movies1 = movies.stream().sorted(comparator).collect(Collectors.toList());
        Iterator<Movie> iterator = movies1.iterator();

        Long start =0l;
        Long end=0l;
        if(iterator.hasNext()){
            Movie one = iterator.next();
            start = one.getStart().getTime();
            end = one.getEnd().getTime();
        }
        while(iterator.hasNext()){
            Movie one = iterator.next();
                  start = one.getStart().getTime();
                  if(end > start)
                      return false;
                  else end = one.getEnd().getTime();

            }
        return true;
      }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("y-M-d H:m");
        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie(sdf.parse("2015-01-01 20:00"), sdf.parse("2015-01-01 21:30")));
        movies.add(new Movie(sdf.parse("2015-01-01 23:10"), sdf.parse("2015-01-01 23:30")));
        movies.add(new Movie(sdf.parse("2015-01-01 21:30"), sdf.parse("2015-01-01 23:00")));
        System.out.println(MovieNight.canViewAll(movies));
    }
}

class Movie {
    private Date start, end;
    public Movie(Date start, Date end) {
        this.start = start;
        this.end = end;
    }
    public Date getStart() {
        return this.start;
    }
    public Date getEnd() {
        return this.end;
    }
}