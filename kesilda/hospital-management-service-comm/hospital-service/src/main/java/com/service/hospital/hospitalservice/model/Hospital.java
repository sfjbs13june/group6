package com.service.hospital.hospitalservice.model;
        import javax.persistence.Column;
        import javax.persistence.Entity;
        import javax.persistence.GeneratedValue;
        import javax.persistence.Id;

@Entity
public class Hospital {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;

    public Integer getTd() {
        return id;
    }

    public void setTd(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

@Override
	public String toString() {
		return "Hospital  [id=" + id 
				+ ", name=" + name + ", dsrc_id="
				+ ", address=" + address + "]";
	}
}
