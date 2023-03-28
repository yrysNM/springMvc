package springMvc.entity;

public class Wheather {
  private String lat;
  private String lon;
  private String exclude;

  public Wheather(String lat, String lon, String exclude) {
    this.lat = lat;
    this.lon = lon;
    this.exclude = exclude;
  }

  public Wheather() {
  }

  public String getLat() {
    return lat;
  }

  public void setLat(String lat) {
    this.lat = lat;
  }

  public String getLon() {
    return lon;
  }

  public void setLon(String lon) {
    this.lon = lon;
  }

  public String getExclude() {
    return exclude;
  }

  public void setExclude(String exclude) {
    this.exclude = exclude;
  }

}
