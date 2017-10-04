(ns net.sohalt.ulid
  (:import de.huxhorn.sulky.ulid.ULID
           de.huxhorn.sulky.ulid.ULID$Value))

(defonce ^:private ulid-instance (ULID.))

(defn ulid
  "generates a ULID in string representation"
  ^String
  []
  (.nextULID ulid-instance))

(defn ulid-bytes
  "generates a ULID in binary representation"
  ^bytes
  []
  (.toBytes (.nextValue ulid-instance)))

(defn string->bytes
  "converts a ULID from string representation to binary representation"
  ^bytes
  [^String s]
  (.toBytes (ULID/parseULID s)))

(defn bytes->string
  "converts a ULID from binary representation to string representation"
  ^String
  [^bytes b]
  (.toString (ULID/fromBytes b)))
