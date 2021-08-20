package com.nepplus.listview.datas

class StudentData(val name : String,
                  val birthYear : Int,
                  val address : String) {

//학생의 기능으로 => 나이를 계산해서 알려주는 기능?

    fun getKoreanAgeByYear( year : Int ) : Int {

        val age = year - this.birthYear + 1

        return age

    }


}