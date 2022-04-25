import scala.collection.immutable.HashMap

@main def hello: Unit =
  // paul should be: .--. .- ..- .-..
  println("paul".split("").map(letterToMorseCode.getOrElse(_, "ERROR")).mkString(" "))
  // dog should be: -.. --- --.
  println("dog".split("").map(letterToMorseCode.getOrElse(_, "ERROR")).mkString(" "))
  // sos should be: ... --- ...
  println("sos".split("").map(letterToMorseCode.getOrElse(_, "ERROR")).mkString(" "))

  // .--. .- ..- .-.. should be: paul
  println(".--. .- ..- .-..".split(" ").map(morseCodeToLetter.getOrElse(_, "ERROR")).mkString)
  // -.. --- --. should be: dog
  println("-.. --- --.".split(" ").map(morseCodeToLetter.getOrElse(_, "ERROR")).mkString)
  // ... --- ... should be: sos
  println("... --- ...".split(" ").map(morseCodeToLetter.getOrElse(_, "ERROR")).mkString)

val morseCodeToLetter: Map[String, String] = HashMap[String, String] (
  ".-" -> "a",
  "-..." -> "b",
  "-.-." -> "c",
  "-.." -> "d",
  "." -> "e",
  "..-." -> "f",
  "--." -> "g",
  "...." -> "h",
  ".." -> "i",
  ".---" -> "j",
  "-.-" -> "k",
  ".-.." -> "l",
  "--" -> "m",
  "-." -> "n",
  "---" -> "o",
  ".--." -> "p",
  "--.-" -> "q",
  ".-." -> "r",
  "..." -> "s",
  "-" -> "t",
  "..-" -> "u",
  "...-" -> "v",
  ".--" -> "w",
  "-..-" -> "x",
  "-.--" -> "y",
  "--.." -> "z",
  "-----" -> "0",
  ".----" -> "1",
  "..---" -> "2",
  "...--" -> "3",
  "....-" -> "4",
  "....." -> "5",
  "-...." -> "6",
  "--..." -> "7",
  "---.." -> "8",
  "----." -> "9",
  ".-.-.-" -> ".",
  "--..--" -> ",",
  "..--.." -> "?",
  "-.-.--" -> "!",
  "...---..." -> "sos",
)

val letterToMorseCode: Map[String, String] = morseCodeToLetter.map((key, value) => value -> key)