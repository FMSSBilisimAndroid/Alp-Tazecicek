# NAMESPACE Nedir?
  
  - Namespace mantıksal olarak Class, Enums, Interface, Struct, Delegate gibi yapıların hiyerarşik sıralanması için kullanılan isim alanlarıdır.
  - Aynı isimlerde bulunan Class, Enum, Interface... vb. gibi değerlerin birbirlerine karışmaması için oluşturulan bir nevi kümeleme sistemi gibi düşünebiliriz. 
  - Namespaceler nested yapıya sahiptir.
  - Frameworkler için standart namespaceler tanımlıdır.
  - Namespaceler User tarafından da özelleştirilebilir. Projeler içersinde yeni namespaceler oluşturulabilir.
  
## Standart Namespaceler
  Aşağıda verilen .Net Framework  namespaceleri standart namespace olarak adlandırılır.
  
  - `System`
  - `System.Net`
  - `System.IO`
  - `System.Collections`
  
  Yukarıda bulunan `System` namespace'i için `System.Net` , `System.IO` ve `System.Collections` namespaceleri nested biçimde tanımlanmıştır.

  
## Kotlin İçin Namespace
  
  Yaptığım araştırmalar sonucunda Kotlin dili için `object` ve `companion object` keyword'ü, c# dilindeki namespace keyword'ünün eşdeğeri olarak kullanıldığını gördüm. 
  ```
  object MyObject {
    val x = 2
    val y = 5
  }
  fun main() {
    val size = MyObject.x * MyObject.y
  }
  ```
  
  
  
