package dev.rodrigovaz;

import java.util.Objects;

public class Serie implements Comparable<Serie> {
    private final String name;
    private final String gender;
    private final Integer episodeTime;


    public Serie(String name, String gender, Integer episodeTime) {
        this.name = name;
        this.gender = gender;
        this.episodeTime = episodeTime;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Integer getEpisodeTime() {
        return episodeTime;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", episodeTime=" + episodeTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(name, serie.name) && Objects.equals(gender, serie.gender) && Objects.equals(episodeTime, serie.episodeTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, episodeTime);
    }

    @Override
    public int compareTo(Serie o) {
        return Integer.compare(this.getEpisodeTime(), o.getEpisodeTime());
    }
}
