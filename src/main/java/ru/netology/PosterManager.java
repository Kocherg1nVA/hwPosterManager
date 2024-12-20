package ru.netology;

public class PosterManager {

    private String[] movie = new String[0];
    private int limit;

    public PosterManager() {
        this.limit = 5;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void addMovie(String movie) {
        String[] tmp = new String[this.movie.length + 1];
        for (int i = 0; i < this.movie.length; i++) {
            tmp[i] = this.movie[i];
        }
        tmp[tmp.length - 1] = movie;
        this.movie = tmp;
    }

    public String[] findAll() {
        return this.movie;
    }

    public String[] findLast() {
        int result;
        String[] last;
        if (this.limit < this.movie.length) {
            result = this.movie.length - this.limit;
            last = new String[this.limit];
        } else {
            result = 0;
            last = new String[this.movie.length];
        }
        for (int i = 0; i < this.movie.length - result; i++) {
            last[i] = this.movie[this.movie.length - 1 - i];
        }
        return last;
    }
}
