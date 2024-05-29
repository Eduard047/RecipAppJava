package com.recipeapp.demo;

import com.recipeapp.demo.model.Recipe;
import com.recipeapp.demo.repositories.RecipeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(RecipeRepository repository) {
        return args -> {
            // Main Course
            repository.save(new Recipe("Spaghetti Carbonara", "Spaghetti, eggs, pancetta, Parmesan cheese, black pepper", "1. Cook spaghetti in salted boiling water until al dente. 2. In a pan, cook pancetta until crispy. 3. Beat eggs and mix with Parmesan cheese and black pepper. 4. Combine spaghetti, pancetta, and egg mixture.", "Main Course"));
            repository.save(new Recipe("Chicken Curry", "Chicken, curry powder, coconut milk, onions, garlic, ginger", "1. Cook onions, garlic, and ginger in a pan. 2. Add chicken and curry powder, cook until chicken is browned. 3. Pour in coconut milk and simmer until chicken is cooked through.", "Main Course"));
            repository.save(new Recipe("Beef Stroganoff", "Beef, mushrooms, onions, sour cream, mustard", "1. Cook onions and mushrooms in a pan. 2. Add beef and cook until browned. 3. Stir in sour cream and mustard, and simmer until sauce thickens.", "Main Course"));
            repository.save(new Recipe("Vegetable Stir Fry", "Broccoli, bell peppers, carrots, soy sauce, garlic, ginger", "1. Cook garlic and ginger in a pan. 2. Add vegetables and cook until tender. 3. Stir in soy sauce and cook for another minute.", "Main Course"));
            repository.save(new Recipe("Lamb Chops", "Lamb chops, rosemary, garlic, olive oil, salt, pepper", "1. Marinate lamb chops with rosemary, garlic, olive oil, salt, and pepper. 2. Grill until cooked to desired doneness.", "Main Course"));
            repository.save(new Recipe("Salmon Teriyaki", "Salmon, teriyaki sauce, ginger, garlic, sesame seeds", "1. Marinate salmon with teriyaki sauce, ginger, and garlic. 2. Bake or grill until cooked through. 3. Sprinkle with sesame seeds before serving.", "Main Course"));
            repository.save(new Recipe("Pork Schnitzel", "Pork chops, flour, eggs, breadcrumbs, lemon", "1. Pound pork chops thin. 2. Dredge in flour, dip in beaten eggs, and coat with breadcrumbs. 3. Fry until golden brown and serve with lemon wedges.", "Main Course"));
            repository.save(new Recipe("Shrimp Scampi", "Shrimp, garlic, butter, lemon juice, white wine, parsley", "1. Cook garlic in butter in a pan. 2. Add shrimp and cook until pink. 3. Stir in lemon juice and white wine, and cook for another minute. 4. Garnish with parsley.", "Main Course"));
            repository.save(new Recipe("Chicken Alfredo", "Chicken, fettuccine, cream, Parmesan cheese, garlic, butter", "1. Cook chicken in a pan until browned. 2. Add garlic and butter, and cook for another minute. 3. Stir in cream and Parmesan cheese, and simmer until sauce thickens. 4. Toss with cooked fettuccine.", "Main Course"));
            repository.save(new Recipe("Beef Tacos", "Ground beef, taco seasoning, tortillas, lettuce, tomato, cheese", "1. Cook ground beef with taco seasoning. 2. Serve in tortillas with lettuce, tomato, and cheese.", "Main Course"));

            // Breakfast
            repository.save(new Recipe("Pancakes", "Flour, milk, eggs, sugar, baking powder, butter", "1. Mix dry ingredients in a bowl. 2. Add wet ingredients and stir until combined. 3. Cook on a griddle until bubbles form on the surface, then flip and cook until golden brown.", "Breakfast"));
            repository.save(new Recipe("French Toast", "Bread, eggs, milk, cinnamon, sugar", "1. Beat eggs with milk, cinnamon, and sugar. 2. Dip bread slices in the egg mixture. 3. Cook on a griddle until golden brown.", "Breakfast"));
            repository.save(new Recipe("Omelette", "Eggs, cheese, bell peppers, onions, mushrooms", "1. Beat eggs in a bowl. 2. Cook bell peppers, onions, and mushrooms in a pan. 3. Add eggs to the pan and cook until set. 4. Sprinkle with cheese and fold the omelette.", "Breakfast"));
            repository.save(new Recipe("Waffles", "Flour, milk, eggs, sugar, baking powder, butter", "1. Mix dry ingredients in a bowl. 2. Add wet ingredients and stir until combined. 3. Pour batter into a waffle iron and cook until golden brown.", "Breakfast"));
            repository.save(new Recipe("Bagels with Cream Cheese", "Bagels, cream cheese, smoked salmon, capers", "1. Toast bagels. 2. Spread cream cheese on each half. 3. Top with smoked salmon and capers.", "Breakfast"));
            repository.save(new Recipe("Breakfast Burrito", "Tortilla, eggs, cheese, sausage, bell peppers", "1. Cook eggs, sausage, and bell peppers in a pan. 2. Place mixture in a tortilla, sprinkle with cheese, and roll up.", "Breakfast"));
            repository.save(new Recipe("Smoothie Bowl", "Frozen berries, banana, yogurt, granola, honey", "1. Blend frozen berries, banana, and yogurt until smooth. 2. Pour into a bowl and top with granola and honey.", "Breakfast"));

            // Salad
            repository.save(new Recipe("Caesar Salad", "Romaine lettuce, Caesar dressing, croutons, Parmesan cheese", "1. Chop romaine lettuce and place in a bowl. 2. Add Caesar dressing and toss to coat. 3. Top with croutons and Parmesan cheese.", "Salad"));
            repository.save(new Recipe("Greek Salad", "Tomatoes, cucumbers, olives, feta cheese, red onion, olive oil, lemon juice", "1. Chop tomatoes, cucumbers, and red onion. 2. Combine with olives and feta cheese. 3. Drizzle with olive oil and lemon juice, and toss to coat.", "Salad"));
            repository.save(new Recipe("Caprese Salad", "Tomatoes, mozzarella cheese, basil, olive oil, balsamic vinegar", "1. Slice tomatoes and mozzarella cheese. 2. Arrange on a plate with basil leaves. 3. Drizzle with olive oil and balsamic vinegar.", "Salad"));
            repository.save(new Recipe("Cobb Salad", "Lettuce, chicken, bacon, hard-boiled eggs, avocado, blue cheese, tomatoes", "1. Chop lettuce and place in a bowl. 2. Arrange chicken, bacon, hard-boiled eggs, avocado, blue cheese, and tomatoes on top. 3. Drizzle with dressing and serve.", "Salad"));
            repository.save(new Recipe("Fruit Salad", "Strawberries, blueberries, bananas, oranges, kiwi", "1. Chop all fruits and combine in a bowl. 2. Toss gently to mix.", "Salad"));
            repository.save(new Recipe("Tuna Salad", "Tuna, mayonnaise, celery, onions, lettuce", "1. Mix tuna, mayonnaise, celery, and onions in a bowl. 2. Serve on a bed of lettuce.", "Salad"));
            repository.save(new Recipe("Quinoa Salad", "Quinoa, cherry tomatoes, cucumbers, feta cheese, olives, lemon juice", "1. Cook quinoa according to package instructions. 2. Mix with cherry tomatoes, cucumbers, feta cheese, olives, and lemon juice.", "Salad"));

            // Soup
            repository.save(new Recipe("Tomato Soup", "Tomatoes, onions, garlic, vegetable broth, basil", "1. Cook onions and garlic in a pot. 2. Add tomatoes and vegetable broth, simmer until tomatoes are soft. 3. Blend the mixture until smooth. 4. Add basil and season with salt and pepper.", "Soup"));
            repository.save(new Recipe("Chicken Noodle Soup", "Chicken, noodles, carrots, celery, onions, chicken broth", "1. Cook onions, carrots, and celery in a pot. 2. Add chicken and chicken broth, and simmer until chicken is cooked. 3. Add noodles and cook until tender.", "Soup"));
            repository.save(new Recipe("Minestrone Soup", "Vegetable broth, tomatoes, beans, pasta, carrots, celery, onions", "1. Cook onions, carrots, and celery in a pot. 2. Add tomatoes, vegetable broth, and beans. 3. Simmer until vegetables are tender. 4. Add pasta and cook until al dente.", "Soup"));
            repository.save(new Recipe("French Onion Soup", "Onions, beef broth, bread, Gruyere cheese", "1. Cook onions in a pot until caramelized. 2. Add beef broth and simmer. 3. Serve with bread and melted Gruyere cheese on top.", "Soup"));
            repository.save(new Recipe("Butternut Squash Soup", "Butternut squash, onions, garlic, vegetable broth, cream", "1. Cook onions and garlic in a pot. 2. Add butternut squash and vegetable broth, simmer until squash is tender. 3. Blend the mixture until smooth. 4. Stir in cream.", "Soup"));
            repository.save(new Recipe("Lentil Soup", "Lentils, carrots, celery, onions, vegetable broth", "1. Cook onions, carrots, and celery in a pot. 2. Add lentils and vegetable broth, simmer until lentils are tender.", "Soup"));
            repository.save(new Recipe("Clam Chowder", "Clams, potatoes, onions, celery, cream, bacon", "1. Cook bacon in a pot. 2. Add onions and celery, cook until tender. 3. Add potatoes, clams, and cream, simmer until potatoes are tender.", "Soup"));

            // Dessert
            repository.save(new Recipe("Chocolate Cake", "Flour, sugar, cocoa powder, baking powder, eggs, milk, butter", "1. Mix dry ingredients in a bowl. 2. Add wet ingredients and stir until combined. 3. Pour batter into a greased cake pan and bake at 350°F for 30 minutes.", "Dessert"));
            repository.save(new Recipe("Cheesecake", "Cream cheese, sugar, eggs, graham crackers, butter", "1. Mix crushed graham crackers with melted butter and press into a baking dish. 2. Beat cream cheese and sugar until smooth. 3. Add eggs and mix well. 4. Pour mixture over the crust and bake at 325°F for 45-50 minutes.", "Dessert"));
            repository.save(new Recipe("Brownies", "Flour, cocoa powder, sugar, eggs, butter, chocolate chips", "1. Mix dry ingredients in a bowl. 2. Add wet ingredients and stir until combined. 3. Fold in chocolate chips. 4. Pour batter into a greased baking dish and bake at 350°F for 25-30 minutes.", "Dessert"));
            repository.save(new Recipe("Tiramisu", "Mascarpone cheese, coffee, ladyfingers, cocoa powder, sugar, eggs", "1. Beat eggs and sugar until thick. 2. Add mascarpone cheese and mix well. 3. Dip ladyfingers in coffee and layer in a dish. 4. Spread mascarpone mixture over ladyfingers. 5. Repeat layers and dust with cocoa powder.", "Dessert"));
            repository.save(new Recipe("Apple Pie", "Apples, sugar, cinnamon, pie crust", "1. Peel and slice apples. 2. Toss with sugar and cinnamon. 3. Place in a pie crust and cover with a top crust. 4. Bake at 375°F for 45-50 minutes.", "Dessert"));
            repository.save(new Recipe("Chocolate Chip Cookies", "Flour, sugar, brown sugar, butter, eggs, vanilla extract, baking soda, chocolate chips", "1. Cream together butter, sugar, and brown sugar. 2. Add eggs and vanilla extract. 3. Mix in flour and baking soda. 4. Fold in chocolate chips. 5. Drop by spoonfuls onto a baking sheet and bake at 350°F for 10-12 minutes.", "Dessert"));
            repository.save(new Recipe("Panna Cotta", "Cream, sugar, gelatin, vanilla", "1. Heat cream and sugar in a pot until sugar dissolves. 2. Stir in gelatin and vanilla. 3. Pour into molds and chill until set.", "Dessert"));

            // Pizza
            repository.save(new Recipe("Margherita Pizza", "Pizza dough, tomato sauce, mozzarella cheese, basil", "1. Roll out pizza dough and place on a baking sheet. 2. Spread tomato sauce over the dough. 3. Top with mozzarella cheese and basil leaves. 4. Bake at 475°F for 10-15 minutes.", "Pizza"));
            repository.save(new Recipe("Pepperoni Pizza", "Pizza dough, tomato sauce, mozzarella cheese, pepperoni", "1. Roll out pizza dough and place on a baking sheet. 2. Spread tomato sauce over the dough. 3. Top with mozzarella cheese and pepperoni slices. 4. Bake at 475°F for 10-15 minutes.", "Pizza"));
            repository.save(new Recipe("BBQ Chicken Pizza", "Pizza dough, BBQ sauce, mozzarella cheese, chicken, red onions", "1. Roll out pizza dough and place on a baking sheet. 2. Spread BBQ sauce over the dough. 3. Top with mozzarella cheese, chicken, and red onions. 4. Bake at 475°F for 10-15 minutes.", "Pizza"));
            repository.save(new Recipe("Veggie Pizza", "Pizza dough, tomato sauce, mozzarella cheese, bell peppers, onions, olives", "1. Roll out pizza dough and place on a baking sheet. 2. Spread tomato sauce over the dough. 3. Top with mozzarella cheese, bell peppers, onions, and olives. 4. Bake at 475°F for 10-15 minutes.", "Pizza"));
            repository.save(new Recipe("Hawaiian Pizza", "Pizza dough, tomato sauce, mozzarella cheese, ham, pineapple", "1. Roll out pizza dough and place on a baking sheet. 2. Spread tomato sauce over the dough. 3. Top with mozzarella cheese, ham, and pineapple. 4. Bake at 475°F for 10-15 minutes.", "Pizza"));
            repository.save(new Recipe("Prosciutto Pizza", "Pizza dough, tomato sauce, mozzarella cheese, prosciutto, arugula", "1. Roll out pizza dough and place on a baking sheet. 2. Spread tomato sauce over the dough. 3. Top with mozzarella cheese and prosciutto. 4. Bake at 475°F for 10-15 minutes. 5. Top with arugula before serving.", "Pizza"));
            repository.save(new Recipe("Four Cheese Pizza", "Pizza dough, tomato sauce, mozzarella cheese, Parmesan cheese, Gorgonzola cheese, goat cheese", "1. Roll out pizza dough and place on a baking sheet. 2. Spread tomato sauce over the dough. 3. Top with mozzarella, Parmesan, Gorgonzola, and goat cheese. 4. Bake at 475°F for 10-15 minutes.", "Pizza"));

            // Sushi
            repository.save(new Recipe("Sushi Rolls", "Sushi rice, nori, cucumber, avocado, salmon", "1. Cook sushi rice and let it cool. 2. Place a sheet of nori on a bamboo mat. 3. Spread rice over the nori, leaving a small border. 4. Add cucumber, avocado, and salmon. 5. Roll the sushi and cut into pieces.", "Sushi"));
            repository.save(new Recipe("California Roll", "Sushi rice, nori, cucumber, avocado, crab meat", "1. Cook sushi rice and let it cool. 2. Place a sheet of nori on a bamboo mat. 3. Spread rice over the nori, leaving a small border. 4. Add cucumber, avocado, and crab meat. 5. Roll the sushi and cut into pieces.", "Sushi"));
            repository.save(new Recipe("Spicy Tuna Roll", "Sushi rice, nori, cucumber, spicy tuna", "1. Cook sushi rice and let it cool. 2. Place a sheet of nori on a bamboo mat. 3. Spread rice over the nori, leaving a small border. 4. Add cucumber and spicy tuna. 5. Roll the sushi and cut into pieces.", "Sushi"));
            repository.save(new Recipe("Dragon Roll", "Sushi rice, nori, cucumber, avocado, eel", "1. Cook sushi rice and let it cool. 2. Place a sheet of nori on a bamboo mat. 3. Spread rice over the nori, leaving a small border. 4. Add cucumber, avocado, and eel. 5. Roll the sushi and cut into pieces.", "Sushi"));
            repository.save(new Recipe("Rainbow Roll", "Sushi rice, nori, cucumber, avocado, assorted fish", "1. Cook sushi rice and let it cool. 2. Place a sheet of nori on a bamboo mat. 3. Spread rice over the nori, leaving a small border. 4. Add cucumber and avocado. 5. Top with assorted fish slices and roll the sushi. Cut into pieces.", "Sushi"));
            repository.save(new Recipe("Philadelphia Roll", "Sushi rice, nori, cucumber, avocado, cream cheese, smoked salmon", "1. Cook sushi rice and let it cool. 2. Place a sheet of nori on a bamboo mat. 3. Spread rice over the nori, leaving a small border. 4. Add cucumber, avocado, cream cheese, and smoked salmon. 5. Roll the sushi and cut into pieces.", "Sushi"));
            repository.save(new Recipe("Tempura Roll", "Sushi rice, nori, tempura shrimp, avocado, cucumber", "1. Cook sushi rice and let it cool. 2. Place a sheet of nori on a bamboo mat. 3. Spread rice over the nori, leaving a small border. 4. Add tempura shrimp, avocado, and cucumber. 5. Roll the sushi and cut into pieces.", "Sushi"));
        };
    }
}
