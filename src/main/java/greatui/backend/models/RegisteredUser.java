package greatui.backend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Generated
@Entity
@Table(name="registered_table")
public class RegisteredUser {

	@Id
	@Column(name="registeredid")
	private int registeredid;
	
	@Column(name="favorite_food")
	private String favoriteFood;
	
	@Column(name="favorite_color")
	private String favoriteColor;
	
	@Column(name="pet")
	private String favoritePet;
	
	@Column(name="zodiac_sign")
	private String zodiacSign;
	
	@Column(name="favorite_palindrome")
	private String favoritePalindrome;
	
	@OneToOne
	private User myUser;
}
