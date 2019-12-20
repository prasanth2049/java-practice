


public class compareproduct {
       private long id;
       private String ProductName;
       private String supplierName;

       public compareproduct(long id, String productName, String supplierName) {
		super();
		this.id = id;
		ProductName = productName;
		this.supplierName = supplierName;
	}

	public compareproduct() {
       }

       public long getId() {
              return id;
       }

       public void setId(long id) {
              this.id = id;
       }

       public String getProductName() {
              return ProductName;
       }

       public void setProductName(String productName) {
              ProductName = productName;
       }

       public String getSupplierName() {
              return supplierName;
       }

       public void setSupplierName(String supplierName) {
              this.supplierName = supplierName;
       }

       @Override
       public boolean equals(Object arr) {
              if (this == arr) {
                     return true;
              }
              if (arr == null) {
                     return false;
              }
              if (getClass() != arr.getClass()) {
                     return false;
              }
              compareproduct other = (compareproduct) arr;
              if (ProductName == null) {
                     if (other.ProductName != null) {
                           return false;
                     }
              } else if (!ProductName.equals(other.ProductName)) {
                     return false;
              }
              if (id != other.id) {
                     return false;
              }
              if (supplierName == null) {
                     if (other.supplierName != null) {
                           return false;
                     }
              } else if (!supplierName.equals(other.supplierName)) {
                     return false;
              }
              return true;
       }

       public void display() {
              System.out.println("Product id is " + getId());
              System.out.println("Product Name is " + getProductName());
              System.out.println("Supplier Name is " + getSupplierName());
       }
}


