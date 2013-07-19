require qt5-${PV}.inc
require ${PN}.inc

PR = "${INC_PR}.0"

SRC_URI += " \
    file://0001-qmltestexample-fix-link.patch \
    file://0003-Fix-wrong-calculation-of-viewPort-for-transitions.patch \
"

SRC_URI[md5sum] = "604a6e3ae051a21aac0024694d55cb3b"
SRC_URI[sha256sum] = "d8849755c17fca9bb44c09c442001bc5593c24986ea616c536719414e85d90cc"

do_configure_append() {
    for d in tools/qmlmin src/qmldevtools ; do
        sed -i -e s:/usr/lib/libQt5Bootstrap.a:${STAGING_LIBDIR}/libQt5Bootstrap.a:g \
            ${WORKDIR}/build/$d/Makefile
    done
}