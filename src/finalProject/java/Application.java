import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.User;
import model.ShoppingCart;

import service.UserServiceImpl;
import service.ProductServiceImpl;


@RestController
public class Application {

	@Autowired
	private UserServiceImpl userServiceImpl;

		@RequestMapping(value = "users/create", method = RequestMethod.POST)
		public ResponseEntity<?> createUser(@RequestBody User user) {
			userServiceImpl.addUser(user);
			return null;
	}
		
		@RequestMapping(value = "users/{id}", method = RequestMethod.GET)
		public ResponseEntity<User> getUser(@PathVariable int id) {
			 User getUser = userServiceImpl.getUser(id);
			 return new ResponseEntity<User>(getUser, HttpStatus.OK);
		}		
	
		
	@Autowired
	private ProductServiceImpl productServiceImpl;	
	
	@RequestMapping(value = "products/buy", method = RequestMethod.POST)
	public ResponseEntity<ShoppingCart> createCart(@RequestBody ShoppingCart product) {
		productServiceImpl.addProduct(product);
		return new ResponseEntity<ShoppingCart>(product, HttpStatus.OK);		
	}
		
}