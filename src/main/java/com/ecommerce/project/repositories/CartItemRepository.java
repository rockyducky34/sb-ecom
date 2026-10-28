package com.ecommerce.project.repositories;

import com.ecommerce.project.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CartItemRepository extends JpaRepository<CartItem,Long> {
    @Query("SELECT ci from CartItem ci WHERE ci.cart.id = ?1 AND ci.product.id = ?2")
    CartItem findCartItemByProductIdAndCartId(Long cartId, Long productId);

    @Query("DELETE FROM CartItem ci WHERE ci.cart.id = ?2 AND ci.product.id = ?1")
    void deleteCartItemByProductIdAndCartId(Long productId, Long cartId);
}
