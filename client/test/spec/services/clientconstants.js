'use strict';

describe('Service: clientConstants', function () {

  // load the service's module
  beforeEach(module('clientApp'));

  // instantiate service
  var clientConstants;
  beforeEach(inject(function (_clientConstants_) {
    clientConstants = _clientConstants_;
  }));

  it('should do something', function () {
    expect(!!clientConstants).toBe(true);
  });

});
