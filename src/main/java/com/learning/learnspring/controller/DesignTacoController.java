package com.learning.learnspring.controller;

import com.learning.learnspring.model.Design;
import com.learning.learnspring.model.Ingredient;
import com.learning.learnspring.model.Taco;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {

    @GetMapping
    public String showDesignForm(Model model){
        List<Ingredient> ingredients = Arrays.asList(
                new Ingredient("FLTO","Flour Tortilla", Ingredient.Type.WRAP),
                new Ingredient("COTO","Corn Tortilla", Ingredient.Type.WRAP),
        new Ingredient("CARN","Carnitas", Ingredient.Type.PROTEIN),
        new Ingredient("GRBF","Ground beef", Ingredient.Type.PROTEIN),
        new Ingredient("LETC","Letuce", Ingredient.Type.VEGGIES),
        new Ingredient("CHED","Cheddar", Ingredient.Type.CHEESE),
        new Ingredient("SLSA","Salsa", Ingredient.Type.SAUCE),
        new Ingredient("SRCR","Sour Cream", Ingredient.Type.SAUCE)


        );

        Ingredient.Type[] types = Ingredient.Type.values();
        for(Ingredient.Type type : types){
          //  model.addAttribute(type.toString().toLowerCase(),filterByType(ingredients,type));
        }

        model.addAttribute("design", new Taco());
        return "design.html";
    }

    @PostMapping
    public String processDesign(Design design){
        log.info("Processing design: "+design);
        return"redirect:orders/current";
    }
}
