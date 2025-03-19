package com.testing.shishagram.components;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.testing.shishagram.models.CategoriaSabor;
import com.testing.shishagram.models.Direccion;
import com.testing.shishagram.models.Empresa;
import com.testing.shishagram.models.Sabor;
import com.testing.shishagram.models.TipoDireccion;
import com.testing.shishagram.models.Usuario;
import com.testing.shishagram.services.IEmpresaService;
import com.testing.shishagram.services.IUsuarioService;

@Component
public class FooData implements CommandLineRunner {

	@Autowired
	IEmpresaService companyService;

	@Autowired
	IUsuarioService userService;

	@Override
	public void run(String... args) throws Exception {
		Empresa e1, e2;
		Usuario u1;

		e1 = Empresa.builder()
				.username("hibou.madrid")
				.realname("Hibou")
				.password("12345")
				.mail("hibou@hibou.com")
				.telephone("677564534")
				.address(
						Direccion.builder()
								.type(TipoDireccion.CALLE)
								.name("Fuentespina")
								.number("21")
								.city("Madrid")
								.cp("28031")
								.country("Spain")
								.build())
				.flavour(
						Sabor.builder()
								.name("Love 66")
								.ingredients(List.of("Watermelon", "Strawberry", "Gum", "Menthol"))
								.rating(4.5f)
								.category(CategoriaSabor.AFRUTADO)
								.build())
				.build();

		e2 = Empresa.builder()
				.username("whanau_vk")
				.realname("Whanau")
				.password("qwerty")
				.mail("whanau@whanau.com")
				.telephone("912345654")
				.address(
						Direccion.builder()
								.type(TipoDireccion.AVENIDA)
								.name("De las Rosas")
								.number("110")
								.city("Madrid")
								.cp("28014")
								.country("Spain")
								.build())
				.flavour(
						Sabor.builder()
								.name("Blue Mist")
								.ingredients(List.of("Blueberry", "Mint"))
								.rating(4.7f)
								.category(CategoriaSabor.MENTOLADO)
								.build())
				.build();

		companyService.save(e1);
		companyService.save(e2);

		u1 = Usuario.builder()
				.username("Pepelpu")
				.realname("Pepe Lopez")
				.password("12345")
				.mail("pepelpu@pepelpu.com")
				.telephone("677564534")
				.build();

		userService.save(u1);
	}

}
