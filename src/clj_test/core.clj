(ns clj-test.core)

(defn prime-factors-of
  ([n] (prime-factors-of 2 n []))
  ([f n factors]
   (cond
     (= n 1) factors
     (> f (Math/sqrt n)) (conj factors n)
     (zero? (mod n f)) (recur f (/ n f) (conj factors f))
     :else (recur (inc f) n factors))))

(defn split-number
  ([n] (split-number n 10))
  ([n base] (split-number n base []))
  ([n base digits]
   (if (>= n base)
     (recur (quot n base) base (cons (mod n base) digits))
     (cons (mod n base) digits))))

(defn happy-number?
  ([n] (happy-number? n #{n}))
  ([n checked]
   (let [next-number (reduce + (map #(* % %) (split-number n)))]
     (cond
       (= n 1) true
       (checked next-number) false
       :else (recur next-number (conj checked next-number))))))
