package cleaningServices.Acceptance;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import cleaning.services.staticdataBase.Products;
import io.cucumber.java.en.Then;
import model.Product;

public class DeleteProduct {
	
	Product product=Products.findProduct(2);
	@Then("the product will be deleted from the product list")
	public void theProductWillBeDeletedFromTheProductList() {
		int sizeBeforeDelete=Products.getProducts().size();
	    Products.deleteProduct(product);
	    assertTrue(sizeBeforeDelete==Products.getProducts().size()+1);
	}

	@Then("the message that the product is not exist will be print")
	public void theMessageThatTheProductIsNotExistWillBePrint() {
		assertNull(product);
		Products.noProduct();
	}



}
