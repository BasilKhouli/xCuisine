package me.basil.xcuisine

abstract class Recipe {
    abstract val name: String
    abstract val ingredients: List<RecipeIngredients>
}