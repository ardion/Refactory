class jsonList {
    val jsonData = """[
  {
    "id": 323,
    "username": "rinood30",
    "profile": {
      "full_name": "Shabrina Fauzan",
      "birthday": "1988-10-30",
      "phones": [
        "08133473821",
        "082539163912"
      ]
    },
    "articles:": [
      {
        "id": 3,
        "title": "Tips Berbagi Makanan",
        "published_at": "2019-01-03T16:00:00"
      },
      {
        "id": 7,
        "title": "Cara Membakar Ikan",
        "published_at": "2019-01-07T14:00:00"
      }
    ]
  },
  {
    "id": 201,
    "username": "norisa",
    "profile": {
      "full_name": "Noor Annisa",
      "birthday": "1986-08-14",
      "phones": []
    },
    "articles:": [
      {
        "id": 82,
        "title": "Cara Membuat Kue Kering",
        "published_at": "2019-10-08T11:00:00"
      },
      {
        "id": 91,
        "title": "Cara Membuat Brownies",
        "published_at": "2019-11-11T13:00:00"
      },
      {
        "id": 31,
        "title": "Cara Membuat Brownies",
        "published_at": "2019-11-11T13:00:00"
      }
    ]
  },
  {
    "id": 42,
    "username": "karina",
    "profile": {
      "full_name": "Karina Triandini",
      "birthday": "1986-04-14",
      "phones": [
        "06133929341"
      ]
    },
    "articles:": []
  },
  {
    "id": 201,
    "username": "icha",
    "profile": {
      "full_name": "Annisa Rachmawaty",
      "birthday": "1987-12-30",
      "phones": []
    },
    "articles:": [
      {
        "id": 39,
        "title": "Tips Berbelanja Bulan Tua",
        "published_at": "2019-04-06T07:00:00"
      },
      {
        "id": 43,
        "title": "Cara Memilih Permainan di Steam",
        "published_at": "2019-06-11T05:00:00"
      },
      {
        "id": 58,
        "title": "Cara Membuat Brownies",
        "published_at": "2019-09-12T04:00:00"
      }
    ]
  }
]"""
    val jsonInventory = """
        [
          {
            "inventory_id": 9382,
            "name": "Brown Chair",
            "type": "furniture",
            "tags": [
              "chair",
              "furniture",
              "brown"
            ],
            "purchased_at": 1579190471,
            "placement": {
              "room_id": 3,
              "name": "Meeting Room"
            }
          },
          {
            "inventory_id": 9380,
            "name": "Big Desk",
            "type": "furniture",
            "tags": [
              "desk",
              "furniture",
              "brown"
            ],
            "purchased_at": 1579190642,
            "placement": {
              "room_id": 3,
              "name": "Meeting Room"
            }
          },
          {
            "inventory_id": 2932,
            "name": "LG Monitor 50 inch",
            "type": "electronic",
            "tags": [
              "monitor"
            ],
            "purchased_at": 1579017842,
            "placement": {
              "room_id": 3,
              "name": "Lavender"
            }
          },
          {
            "inventory_id": 232,
            "name": "Sharp Pendingin Ruangan 2PK",
            "type": "electronic",
            "tags": [
              "ac"
            ],
            "purchased_at": 1578931442,
            "placement": {
              "room_id": 5,
              "name": "Dhanapala"
            }
          },
          {
            "inventory_id": 9382,
            "name": "Alat Makan",
            "type": "tableware",
            "tags": [
              "spoon",
              "fork",
              "tableware"
            ],
            "purchased_at": 1578672242,
            "placement": {
              "room_id": 10,
              "name": "Rajawali"
            }
          }
        ]
    """
}