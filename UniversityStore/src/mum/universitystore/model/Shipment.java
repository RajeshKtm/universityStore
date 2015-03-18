package mum.universitystore.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class Shipment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToMany(mappedBy = "shipment")
	@LazyCollection(LazyCollectionOption.TRUE)
	private List<Order> orders;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private Member member;

	@Column(name = "track_location")
	private String trackLocation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public String getTrackLocation() {
		return trackLocation;
	}

	public void setTrackLocation(String trackLocation) {
		this.trackLocation = trackLocation;
	}

}
