package io.github.tambonbon.shared

trait Summarizer {
  def summarize(item: String)  
}

class Summar extends Summarizer{
  def summarize(item: String): Unit = println("Hello")
}