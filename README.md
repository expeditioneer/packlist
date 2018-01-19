# packlist
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Build Status](https://travis-ci.org/nbossard/packlist.svg?branch=master)](https://travis-ci.org/nbossard/packlist)
[![Github All Releases](https://img.shields.io/github/downloads/nbossard/packlist/total.svg)](https://github.com/nbossard/packlist/releases)
## An open-source packing list for Android

Why another packing-list... because existing are incomplete, out-of-date or expensive and anyway not open-source.
Which is very disappointing when you wish to save your lists and keep your phone out of always running tracking apps.

You can download APK on [releases](https://github.com/nbossard/packlist/releases/) page or get it from them:

<p align="left">
<a href="https://play.google.com/store/apps/details?id=com.nbossard.packlist">
    <img alt="Get it on Google Play"
        height="80"
        src="https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png" />
</a>  
<a href="https://f-droid.org/repository/browse/?fdid=com.nbossard.packlist">
    <img alt="Get it on F-Droid"
        height="80"
        src="https://f-droid.org/badge/get-it-on.png" />
        </a>
        </p>

Tech note : GitHub and Play Store releases use same certificate. F-Droid uses their own certificate.

### Screenshots

[Screenshots in english can be found here](./pub/res_pub/latest/en/).
They are also available in [other languages](./pub/res_pub/latest/)

![One tab screenshot](./pub/res_pub/latest/en/tab/trip_detail.png)

### Objectives in term of functionality : 
 * multi-language (currently English , Japanese, Dutch, Chinese, Indonesian, Turkish, spanish and French but please help for others)
 * pre-filling of list through questions on what you are planning to do during your trip
 
### Objectives : 
 * free
 * open-source
 * high respect of user privacy: no usage tracker, no automatic crash report, no data uploaded, no permissions [see FAQ, "where is data stored"](doc/faq.md)

### Objectives in term of coding :
 - multi-developer (YES you are welcome to help)
 - GitFlow organisation
 - high quality code
   - very strict formatting rules
   - mandatory usage of quality plugins : checkstyle, findbugs
   - exhaustive javadoc
   - unit testing and Robotium testing and UI automator
   - continuous integration using Travis (https://travis-ci.org/nbossard/packlist)
 - rich yet light logging (usage of https://github.com/JakeWharton/hugo)
 - large usage of plantuml for documentation ([see project plantuml doc](doc/plantuml.md))
 - re-use of external libraries on GitHub
   - changelog : https://github.com/gabrielemariotti/changeloglib
   - datetimepicker (https://github.com/flavienlaurent/datetimepicker)
   - Material Letter Icon (https://github.com/IvBaranov/MaterialLetterIcon)
- effort on accessibility ([see detailed doc](doc/accessibility.md))


### BUT a place for experimentation of up-to-date technology
- material design
- android studio 3.0
- vector drawables, using asset studio
- android data-binding (http://developer.android.com/tools/data-binding/guide.html)
- constraint layouts (Work in progress)
- java 8 code formatting

### Licence
Apache 2

### Development status
Basic functionality are fresh but working, advanced functionality are being added when asked in issue tracker. 

### History of release

[See detailed changelog in "changelog.xml"](app/src/main/res/raw/changelog.xml)

- 0.13   (18th december 2017) adding support of 5 new languages
- 0.12   (15th november 2017) improving categories colors, fixing crashes when coming from background
- 0.11   (25th june     2017) improving categories management
- 0.10.2 ( 3rd august   2016) fixing again bug encountered in 0.10 (crash at start on empty trip name), in class MaterialColor
- 0.10.1 (23rd july     2016) fixing bug encountered in 0.10 (crash at start on empty trip name)
- 0.10   (21st july     2016) adding categories and item suggestions
- 0.9    (26th may      2016) adding export, improved sorting, unpacking all, improved accessibility
- 0.8.1  (26th april    2016) adding crash reports, bug fixing and minor changes  
- 0.8    ( 9th april    2016) mass import and total weight
- 0.7.1  (22th march    2016)  bug-fixing
- 0.7    (19th march    2016)  bug-fixing
- 0.6    (14th march    2016)
- 0.5    (18th february 2016)
- 0.4    ( 8th february 2016)
- 0.3 alpha 
- 0.2 alpha (24th january 2016)
- 0.1 alpha ( 6th january 2016)

### Want to know more ?

Have a look at [doc](doc/readme.md) folder.
