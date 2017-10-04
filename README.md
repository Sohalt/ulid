# ulid

A Clojure library for generating Universally Unique Lexicographically Sortable Identifiers (ULIDs), as defined in https://github.com/alizain/ulid.

Wraps https://github.com/huxi/sulky/tree/master/sulky-ulid and therefore supports the binary format.

## Usage

```clojure
(require '[net.sohalt/ulid :as ulid])

; Generate ULID String
(ulid/ulid)
; => "01BVKR4BRVFTS9HS5CXBT6FH9A"

; Generate ULID in binary representation
(ulid/ulid-bytes)
; => #object["[B" 0x8b88b24 "[B@8b88b24"]

; Convert from string representation to binary 
(ulid/string->bytes (ulid/ulid))
; => #object["[B" 0x27115083 "[B@27115083"]

; Convert from binary representation to string 
(ulid/bytes->string (ulid/ulid-bytes))
; => "01BVKRV6TVZF83WXE1VTG48QFC"
```

## License

Copyright © 2017 sohalt

Distributed under the Apache License 2.0
