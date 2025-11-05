fun main() { // шаг 5
//    val naruto: Hero = Hero()
//    println("Имя: ${naruto.name} \nПол: ${naruto.gender} \nКласс: ${naruto.role}\nЗдоровье: ${naruto.hp}\nМана: ${naruto.mp}")
//    naruto.name = "Наруто Узумаки"
//    naruto.gender = "Мужской"
//    naruto.role = "Хокаге"
//    naruto.hp = 200
//    naruto.mp = 150
//    println("Имя: ${naruto.name} \nПол: ${naruto.gender} \nКласс: ${naruto.role}\nЗдоровье: ${naruto.hp}\nМана: ${naruto.mp}")
//
//    val sasuke = Hero()
//    sasuke.name = "Саске Учиха"
//    sasuke.gender = "Мужской"
//    sasuke.role = "Шиноби-отступник"
//    sasuke.hp = 120
//    sasuke.mp = 180
//    println("Имя: ${sasuke.name} \nПол: ${sasuke.gender} \nКласс: ${sasuke.role}\nЗдоровье: ${sasuke.hp}\nМана: ${sasuke.mp}")
//
//    val godjo = Hero()
//    godjo.name = "Годжо Сатору"
//    godjo.gender = "Мужской"
//    godjo.role = "Маг Проклятий"
//    godjo.hp = 160
//    godjo.mp = 300
//    println("Имя: ${godjo.name} \nПол: ${godjo.gender} \nКласс: ${godjo.role}\nЗдоровье: ${godjo.hp}\nМана: ${godjo.mp}")
//
//    val hero = Hero()
//    print("Введите имя героя: ")
//    hero.name = readln()
//    print("Введите пол героя: ")
//    hero.gender = readln()
//    print("Введите класс героя: ")
//    hero.role = readln()
//    print("Введит здоровье героя: ")
//    hero.hp = readln().toInt()
//    print("Введите ману героя: ")
//    hero.mp = readln().toInt()
//    println("Имя: ${hero.name} \nПол: ${hero.gender} \nКласс: ${hero.role}\nЗдоровье: ${hero.hp}\nМана: ${hero.mp}")
//
//    val hero = Hero()
//    hero.name = "Утер"
//    hero.gender = "Мужской"
//    hero.role = "паладин"
//    hero.hp = 450
//    hero.mp = 600
//    hero.level = 50
//    hero.element = "свет"
//    println("Имя: ${hero.name} \nПол: ${hero.gender} \nКласс: ${hero.role}\nЗдоровье: ${hero.hp}\nМана: ${hero.mp} \nУровень ${hero.level} \nСтихия: ${hero.element}")
//
//    hero.sayHello()
//    hero.showStats()
//    hero.meditate()
//    hero.takeDamage()
//    hero.castSpell()
//    hero.heal()

//    val hero = Hero()
//    hero.greet(hero.name)
//    hero.greet("Наруто")

//    val hero = Hero()
//    hero.takeDamage(30)
//    hero.takeDamage(20)

//    val naruto = Hero()
//    naruto.name = "Наруто"
//    naruto.role = "Шиноби"
//    naruto.element = "Ветер"
//
//    val orochimaru = Enemy()
//    orochimaru.name = "Орочимару"
//    naruto.showStats()
//    println("Наруто увидел врага ${orochimaru.name}! Его здоровье - ${orochimaru.hp}")
//    naruto.attack(orochimaru, 25)

//    val naruto = Hero("наруто", "мужской", "шиноби", 100, 200, 5, "ветер")
//
//    val kakashi = Hero("какаши", "мужской", "шиноби", 250, 300, 15, "молния")
//
//    val ororchimaru = Enemy("орочимару", 350, "ветер")
//
//    naruto.castSpellOn(ororchimaru, "Расенган", 30)
//    naruto.duel(kakashi)

//    val hero1 = Hero(name = "Артур", hp = 100)
//    println("Герой жив? ${hero1.isAlive()}")
//    val hero2 = Hero(name = "Артур", hp = 0)
//    println("Герой жив? ${hero2.isAlive()}")

//    val hero = Hero(name = "Артур", level = 4)
//    val easyQuest = Quest("сбор трав", 2, 100, "легкий")
//    val hardQuest = Quest("охота на дракона", 10, 1000, "сложный")
//
//    hero.canAcceptQuest(easyQuest)
//    hero.canAcceptQuest(hardQuest)

    val enemy1 = Enemy("гоблин", 30)
    println(enemy1.getThreatLevel())

    val enemy2 = Enemy("Орк", 100)
    println(enemy2.getThreatLevel())

    val enemy3 = Enemy("Дракон", 200)
    println(enemy3.getThreatLevel())

}