package com.onlinestore.inventory.controller;

import com.onlinestore.shared.model.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @GetMapping("/product/{productId}")
    public Product getProduct(@PathVariable String productId) {
        // Logika untuk mendapatkan detail produk berdasarkan productId
        return new Product(productId, "Contoh Produk", 100.0);
    }

    @PostMapping("/product")
    public Product addProduct(@RequestBody Product product) {
        // Logika untuk menambahkan produk ke inventaris
        return product;
    }

    @PutMapping("/product/{productId}")
    public Product updateProduct(@PathVariable String productId, @RequestBody Product product) {
        // Logika untuk memperbarui informasi produk dalam inventaris
        return product;
    }

    @DeleteMapping("/product/{productId}")
    public void deleteProduct(@PathVariable String productId) {
        // Logika untuk menghapus produk dari inventaris
    }
}
