
package mitocode1;

import java.util.Objects;


public class Persona implements Comparable<Persona>{
   private int id;
   private String nom;
   private int edad;

    public Persona(int id, String nom, int edad) {
        this.id = id;
        this.nom = nom;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

     @Override
    public int compareTo(Persona o) {
    return this.edad-o.getEdad();
    }
    
    
    @Override
    public int hashCode() {
    int hash = 7;
    hash = 67 * hash + this.id;
    hash = 67 * hash + Objects.hashCode(this.nom);
    hash = 67 * hash + this.edad;
    return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
    if (this == obj) {
    return true;
    }
    if (obj == null) {
    return false;
    }
    if (getClass() != obj.getClass()) {
    return false;
    }
    final Persona other = (Persona) obj;
    if (this.id != other.id) {
    return false;
    }
    if (this.edad != other.edad) {
    return false;
    }
    if (!Objects.equals(this.nom, other.nom)) {
    return false;
    }
    return true;
    }
    
    @Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nom + ", edad=" + edad + "]";
	}
}
