package Gestion_Locaton_Voiture.Controlleur;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import Gestion_Locaton_Voiture.Services.OrderService;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/Orders")
@RequiredArgsConstructor
public class OrderControlleur {

	private final OrderService orderService;

}
