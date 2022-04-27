package `2Generics`

object Main {
    fun main() {
        /* Box without generics */
        val box = Box(1)
//        val myNumber: Int = box.elem
        val myNumber: Int = box.elem as Int

        /* Box with generics */
        val box2 = Box2(1)
        val myNumber2: Int = box2.elem

        /* Generic method */
        val box3 = createBox("asd")


        /* Examples with repositories and generics */
        val dogRepo = DogRepo()
        dogRepo.add(Dog(1, "manchi"))
        val dog = dogRepo.find(1)

        val catRepo = CatRepo()
        catRepo.add(Cat("1", "simon"))
        val cat = catRepo.find("1")
    }
}
