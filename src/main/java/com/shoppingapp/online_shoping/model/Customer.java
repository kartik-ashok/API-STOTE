package com.shoppingapp.online_shoping.model;

import java.util.List;
// import java.util.Map;
// import java.util.Set;

// import jakarta.persistence.CollectionTable;
// import jakarta.persistence.Column;
// import jakarta.persistence.ElementCollection;
// import jakarta.persistence.CollectionTable;
// import jakarta.persistence.Column;
// import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customer_id;
    private String customerName;  
   

    // @ElementCollection
    // @CollectionTable(name = "product_tags", joinColumns = @JoinColumn(name = "product_id"))
    // @Column(name = "tag")
    private List<String> wishlist;  
    private String email;
    private String address;
    @Override
    public String toString() {
        System.out.println("I am  Last  function Invoked");
        return "Customer [customer_id=" + customer_id + ", customerName=" + customerName + ", wishlist=" + wishlist
                + ", email=" + email + ", address=" + address + "]";
    }

    // private Map<String,String> preferences;
    // private Set<Integer> visited_products;
    // @ElementCollection
    // @CollectionTable(name = "customer_visited_products", joinColumns = @JoinColumn(name = "customer_id"))
    // @Column(name = "product_id")
    // private Set<Integer> visited_products;
}

