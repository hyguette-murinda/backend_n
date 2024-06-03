package rca.ne.prep.v1.dto.requests;

import lombok.Data;
import rca.ne.prep.v1.models.CartItem;
import rca.ne.prep.v1.models.User;

import java.util.ArrayList;
import java.util.List;

@Data
public class CreateCartDto {
    private User user;
    private List<CartItem> cartItems = new ArrayList<>();


}
