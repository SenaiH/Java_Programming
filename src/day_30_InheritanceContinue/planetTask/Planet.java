package day_30_InheritanceContinue.planetTask;

public class Planet {
private String name;
private double mass,radius,gravity,area,volume;
private long population;

    public Planet(String name, double mass, double radius, double gravity, double area, double volume, long population) {
        setName(name);
        setMass(mass);
        setRadius(radius);
        setGravity(gravity);
        setArea(area);
        setVolume(volume);
        setPopulation(population);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getGravity() {
        return gravity;
    }

    public void setGravity(double gravity) {
        this.gravity = gravity;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", radius=" + radius +
                ", gravity=" + gravity +
                ", area=" + area +
                ", volume=" + volume +
                ", population=" + population +
                '}';
    }
}
/*
1. create a class called Planet
			variables:
					name, mass, radius, surfaceGravity, surfaceArea, volume, population

			Encapsulate all the fields

			Add a constructor that can set all the fields

			methods:
				toString()

	2. create the following subclasses of Planet
			1. Earth
			2. Moon
			3. Mercury
			4. Venus

			Note: you can search them on google
 */