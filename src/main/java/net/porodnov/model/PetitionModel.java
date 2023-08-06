package net.porodnov.model;

public class PetitionModel extends IdAndTitleModel {

    private GeoModel geo;
    private Level level;
    private Status status;

    public GeoModel getGeo() {
        return geo;
    }

    public void setGeo(GeoModel geo) {
        this.geo = geo;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
