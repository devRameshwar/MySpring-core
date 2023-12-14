package in.FlipkartEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "FlipkartData")
@Data
@AllArgsConstructor
public class Flipkart {
	@Id
	@Column(name = "ProductId", length = 5)
	private Integer productId;
	@Column(name = "ProductName", length = 20)
	private String productName;
	@Column(name = "QTY")
	private Integer qty;
	@Column(name = "Price")
	private double price;

}
