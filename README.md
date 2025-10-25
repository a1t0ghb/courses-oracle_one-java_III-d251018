<!-- Badges:
- Source: 'https://shields.io/docs/static-badges', 'https://shields.io/badges/static-badge'.
- HTML structure followed: 'https://github.com/facebook/docusaurus/blob/main/README.md?plain=1'.
- Badges with logos: 'https://shields.io/docs/logos', 'https://simpleicons.org/', 'https://github.com/simple-icons/simple-icons/blob/master/slugs.md'.
- HTML <a> tag not redirecting: 'https://stackoverflow.com/questions/8260546/make-a-html-link-that-does-nothing-literally-nothing/8260561#8260561', 'https://www.geeksforgeeks.org/html/how-to-create-html-link-that-does-not-follow-the-link/'.
-->

<!-- Badge: WIP
<div align="left">
  <a href="#" onclick="return false;"><img src="https://img.shields.io/badge/STATUS-WIP-yellow?style=flat"/></a>
</div> -->
<!--
🚧 WIP: section under construction. 🚧
-->

<!-- Badge: Done -->
<div align="left">
  <a href="#" onclick="return false;"><img src="https://img.shields.io/badge/STATUS-DONE-green?style=flat" /></a>
</div>

<!-- README structure followed:
- 'https://www.aluracursos.com/blog/como-escribir-un-readme-increible-en-tu-github/'.
- 'https://github.com/camilafernanda/GlicoCare/'.
- 'https://github.com/nasa/openmct/'.
- 'https://github.com/facebook/docusaurus'.
-->

# Basics of Java (III).

<!--
Enable autoplay of animated images:
- 'https://stackoverflow.com/questions/72508378/enable-gif-autoplay-on-github-readme/72509078#72509078'.
- 'https://github.com/orgs/community/discussions/47709'.
- 'https://github.com/settings/accessibility'.
Image width for GitHub READMEs:
- 'https://github.com/orgs/community/discussions/42424'.
- 'https://gist.github.com/uupaa/f77d2bcf4dc7a294d109'.
-->
<!-- <div align="center">
    <img src="./rsrcs/media/img-readme_frontpage_media.png" alt="README's front-page media." width="1200" />
    <br />
    <figcaption><small>Fig.</small></figcaption>
    <br />
</div>  -->
<div align="center">
    <img src="./rsrcs/media/img-readme_frontpage_gif.gif" alt="README's front-page media." width="1200" />
    <br />
    <figcaption><small>Fig. Code execution in VS Code, of Java app in folder 'course_java_iii_challenge_app_shopping'.</small></figcaption>
    <br />
</div>

Final delivery of the 3rd course: '[Java: trabajar con listas y colecciones de datos](https://app.aluracursos.com/course/java-trabajar-listas-colecciones-datos)', from module (a.k.a. 'formación' in spanish) '[Java Orientado a Objetos G9 - ONE](https://app.aluracursos.com/formacion-java-grupo9-one)', of [Alura LATAM](https://www.aluracursos.com/). <b>Part of [ORACLE Next Education (ONE)](https://www.oracle.com/co/education/oracle-next-education/) education program, in LATAM</b>.

This final delivery consists of 2 projects, each one in it's own folder (using folders structure of [Maven's java build automation tool](https://github.com/a1t0ghb/courses-oracle_one-java_I-d251011/blob/main/README.md#choosing-a-java-automation-tool-for-builds-maven-vs-gradle-vs-intellijs-buitl-in-tool)):

- Course exercise; in folder: [`course_java_iii`](./course_java_iii).
- Course challenge of a shopping app; in folder: [`course_java_iii_challenge_app_shopping`](./course_java_iii_challenge_app_shopping).

<!-- Callouts:
- Improved format taken from examples in 'https://github.com/nasa/openmct/blob/master/README.md?plain=1'.
-->
> [!NOTE]
> This README is **mainly** written in english (en), but it might have some sections in spanish (sp), since course content is in spanish.

# ℹ About.

The course covered topics such as:

- Working with lists in **Java 17**: class `ArrayList<>` and [interface `List<>`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/List.html).
- Using methods from class `ArrayList<>`, to add items, and get the array's size.
- Understanding different types of lists and uses cases; e.g. `ArrayList`, `LinkedList`, `Stack`, and `Vector`.
- Using `var` as a short kewyword for declaring attributes and variables.
- Getting to know **'Javadocs'**; i.e. documentation specific for each Java version, referring methods, classes, interfaces, etc. E.g. *Javadoc 17*: '<https://docs.oracle.com/en/java/javase/17/docs/api/index.html>'.
- Getting to know **superclass `Object`** and its [`.toString()` method](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Object.html#toString()).
- Implementing custom **constructors** for classes: *'predetermined'* (**without parameters**), and additionals.
- Taking advantage of **'Polymorphism'** to **store instances of a superclass**, that later can be converted to their subclasses, *depending on the use case*.
- Using `for` to access instances stored in a list.
- Learning to sort lists using 2 approaches:
    1. Using class `Collections`, and also implementing interface `Comparable` in the class that's used to compare instances.
    2. Using class `Comparator`, for *'on-the-fly'* comparissons, due to not requiring to implement the interface `Comparable`, but using 'Method Reference', a reduced form of a **lambda expression**.

## 🥇 Course Certificate of Completion.

Available at '<https://app.aluracursos.com/certificate/cf0cfce1-6eb1-4e00-947f-ac6b0dc52532>'.

- Estimated workload: 8h.
- Activities: 48.
- Topics:
    1. 'Colección de peliculas'.
    2. 'Construyendo objetos'.
    3. 'Lista de objetos distintos'.
    4. 'Ordenando datos'.
    5. 'Consolidando conocimientos'.

## 🔗 Links to program resources.

**PROGRAM STRUCTURE.**

- <b>*[Course]* 'Java: trabajar con listas y colecciones de datos'</b>: '<https://app.aluracursos.com/course/java-trabajar-listas-colecciones-datos>'.
- *[Module]* 'Java Orientado a Objetos G9 - ONE': '<https://app.aluracursos.com/formacion-java-grupo9-one/>'.
- **ORACLE Next Education (ONE) education program, in LATAM**: '<https://www.oracle.com/co/education/oracle-next-education/>'.
- Alura LATAM education platform: '<https://www.aluracursos.com/>'.

**COURSE RESOURCES.**

- GitHub's project repository: '<https://github.com/alura-es-cursos/screen-match-3>'.
    - Branch for course exercises: `Aula0` to `Aula4`. Ref.: '<https://github.com/alura-es-cursos/screen-match-3/tree/Aula0>'.
    - Repo for course challenge. Ref.: '<https://github.com/alura-cursos/2024-java3-desafio/tree/master>'.

# 🐾 Notes About Project.

> [!NOTE]
> This section is only for reference, for documentation purposes in case of re-visiting course notes.

No aditional notes.

<!-- Embed dynamic content (image) of contributors:
- 'https://dev.to/lacolaco/introducing-contributors-img-keep-contributors-in-readme-md-gci'.
- 'https://contrib.rocks/'.
-->
# 🤝 Contributors.

<a href="https://github.com/a1t0ghb/courses-oracle_one-java_III-d251018/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=a1t0ghb/courses-oracle_one-java_III-d251018" />
</a>

Made with [contrib.rocks](https://contrib.rocks).

<!-- Authors table structure
- From repo: 'https://github.com/camilafernanda/GlicoCare/blob/main/README.md?plain=1'.
-->
# 📜 Authors.

| [<img src="https://avatars.githubusercontent.com/u/32377614?v=4" width=70><br><sub>a1t0ghb</sub>](https://github.com/a1t0ghb) |
| :---: |
<!-- EOF. -->