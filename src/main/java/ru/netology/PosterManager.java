package ru.netology;

public class PosterManager {

    private String[] movie = new String[0];
    private int limit;
    private int requiredLength;


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

    public void findRequirementLength() {
        if (this.movie.length < this.limit) {
            this.requiredLength = this.movie.length;
        } else {
            this.requiredLength = this.limit;
        }
    }

    public String[] findLast() {

        String[] last = new String[0];

        if (this.requiredLength < this.movie.length) {
            int result = this.movie.length - this.limit;
            String[] tmp1 = new String[limit];
            for (int i = 0; i < this.movie.length - result; i++) {
                tmp1[i] = this.movie[this.movie.length - 1 - i];
                last = tmp1;
            }
        } else {
            String[] tmp2 = new String[this.requiredLength];
            for (int i = 0; i < this.movie.length; i++) {
                tmp2[i] = this.movie[this.movie.length - 1 - i];
                last = tmp2;
            }
        }
        return last;
    }
}
