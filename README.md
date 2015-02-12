# rationals-kata
Executing the rationals kata as proposed by @trikitrok at the [Scala Bcn Meetup](http://www.meetup.com/Scala-Developers-Barcelona/events/219559165/) but in clojure

Description: https://gist.github.com/trikitrok/0652d91c85cd5a5305c4

(local copy below)

# Rationals addition kata

We'll program the addition of two rationals using TDD.

Suggested API for the method (in Java):

<pre>
  public Rational add(Rational rational);
</pre>

Constraints:

* Rationals must be immutable after creation.
* They have to be stored in reduced form, e.g., 2/4 would be stored as 1/2, check [greatest common divisor computation](http://en.wikipedia.org/wiki/Euclidean_algorithm#Implementations)

# Technical help
## Light Table
go to project.clj, control+space (in mac), choose instarepl, wait for to finish connecting. It might fail
go to test/\*clj and command+enter to execute expressions / facts
