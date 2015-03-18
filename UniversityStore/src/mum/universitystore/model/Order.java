package mum.universitystore.model;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Channel channel;

	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Member user;

	@Column(name = "order_date")
	@Temporal(TemporalType.DATE)
	private Date orderDate;
	
	@Column(name="is_paid")
	private Boolean isPaid;
	
	@OneToOne(optional=true,cascade=CascadeType.ALL)
	private Shipment shipment;
	
	
}
